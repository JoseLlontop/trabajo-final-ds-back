package com.example.ComponenteBackEnd.services;

import com.example.ComponenteBackEnd.models.*;
import com.example.ComponenteBackEnd.repository.*;
import com.example.ComponenteBackEnd.services.Interfaces.ICobranzaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CobranzaService implements ICobranzaService {

    @Autowired
    private CobranzaRepository repository;

    @Autowired
    private BancoRepository bancoRepository;

    @Autowired
    private ObraSocialRepository obraSocialRepository;


    @Override
    public List<Cobranza> getAll(){
        return (List<Cobranza>) repository.findAll();
    }

    @Override
    public Cobranza getById(int id) {
        return (Cobranza) repository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Cobranza cobranza) {

        // Validar que las entidades asociadas existan en la base de datos
        if (cobranza.getTransferencias() != null ) {
            for (Transferencia transferencia : cobranza.getTransferencias()) {
                // Validar que el banco asociado a la transferencia exista en la base de datos
                Banco banco = bancoRepository.findById(transferencia.getBanco().getID())
                        .orElseThrow(() -> new RuntimeException("Banco no encontrado con ID: " + transferencia.getBanco().getID()));
            }
        }

        // Validar que la obra social asociada a la cobranza exista en la base de datos
        if (cobranza.getCliente() != null) {
            ObraSocial obraSocial = obraSocialRepository.findById(cobranza.getCliente().getID())
                    .orElseThrow(() -> new RuntimeException("Obra social no encontrada con ID: " + cobranza.getCliente().getID()));
            cobranza.setCliente(obraSocial);
        }

        // Asignar la cobranza a los cheques
        if (cobranza.getCheques() != null) {
            for (Cheque cheque : cobranza.getCheques()) {
                cheque.setCobranza(cobranza);
            }
        }

        // Asignar la cobranza a las transferencias
        if (cobranza.getTransferencias() != null) {
            for (Transferencia transferencia : cobranza.getTransferencias()) {
                transferencia.setCobranza(cobranza);
            }
        }

        // Guardar la cobranza
        repository.save(cobranza);
    }
}


