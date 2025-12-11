package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustomRequest;
import com.example.demo.dto.ErrorResponse;
import com.example.demo.dto.RigobertoRequest;
import com.example.demo.service.SortService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/sort")
public class SortController {

    @Autowired
    private SortService service;

    @PostMapping("/insertion")
    public ResponseEntity<?> insertionSort(@RequestBody CustomRequest entity) {
        if (entity == null || entity.getData() == null || entity.getData().isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.setError("Error en la entrada de datos");
            error.setDetail("Necesitamos que llenes 'data' con datos numéricos separados por comas.");
            return ResponseEntity.badRequest().body(error);
        }

        if (!entity.getData().contains(",")) {
            ErrorResponse error = new ErrorResponse();
            error.setError("Error de datos de entrada");
            error.setDetail("Necesitamos las comas nena");
            return ResponseEntity.badRequest().body(error);
        }

        String[] stringData = entity.getData().split(",");
        int[] arrNum = new int[stringData.length];

        for (int i = 0; i < stringData.length; i++) {
            String token = stringData[i].trim();
            try {
                arrNum[i] = Integer.parseInt(token);
            } catch (NumberFormatException e) {
                ErrorResponse error = new ErrorResponse();
                error.setError("Hubo un error de datos");
                error.setDetail("El valor '" + token + "' no es un número válido.");
                System.out.println("Dato incorrecto: " + token);
                return ResponseEntity.badRequest().body(error);
            }
        }

        int[] sorted = service.sort(arrNum);
        return ResponseEntity.ok(sorted);
    }

    @PostMapping("/rigoberto")
    public ResponseEntity<?> rigoberto(@RequestBody RigobertoRequest request) {
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/path")
    public String getPath(@RequestParam String param) {
        return param;
    }
}
