package com.example.autentia.gestor.service;

import com.example.autentia.gestor.entity.dto.GastoDTO;
import com.example.autentia.gestor.repository.CuentaRepository;
import com.example.autentia.gestor.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GastosService {

    @Autowired
    GastoRepository gastoRepository;

    @Autowired
    CuentaRepository cuentaRepository;

    public boolean ingresarGasto(GastoDTO gastoDTO) {
        return true;
    }

    public ArrayList<GastoDTO> devolverGastos() {

        return gastoRepository.;
    }
}