package com.example.recompensaML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    
    @GetMapping("/{id}")
    public ResponseEntity<Conta> getContaById(@PathVariable Long id){
        Conta conta = (Conta) contaRepository.findById(id).orElse(null);
        if(conta == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(conta);
        }


    }


        @PostMapping
    public ResponseEntity<Conta> criarConta(@RequestBody Conta conta) {
        Conta novaConta = new Conta(conta.getCliente());
        Conta contaSalva = contaRepository.save(novaConta);
        return ResponseEntity.ok(contaSalva);
    }

    


}



 

