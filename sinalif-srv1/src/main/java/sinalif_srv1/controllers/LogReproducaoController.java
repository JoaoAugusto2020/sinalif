package sinalif_srv1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sinalif_srv1.dtos.LogReproducaoRecordDto;
import sinalif_srv1.models.LogReproducao;
import sinalif_srv1.services.LogReproducaoService;

import java.util.List;

@RestController
@RequestMapping("/srv1/historico")
public class LogReproducaoController {

    @Autowired
    private LogReproducaoService logReproducaoService;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<LogReproducao> listarLogReproducao(){
        return logReproducaoService.listarLogReproducao();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public LogReproducao detalharLogReproducao(@PathVariable Long id){
        return logReproducaoService.detalharLogReproducao(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public LogReproducao salvarLogReproducao(@RequestBody LogReproducaoRecordDto logRepDto){
        return logReproducaoService.salvarLogReproducao(logRepDto);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
    public void excluirLogReproducao(@PathVariable Long id){
        logReproducaoService.excluirLogReproducao(id);
    }
}
