package api.desafio.api;

import api.desafio.domain.request.VotacaoRequest;
import api.desafio.domain.response.ResponsePadrao;
import api.desafio.domain.services.VotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/votacao")
public class VotacaoController {
    @Autowired
    private VotacaoService service;

    @GetMapping
    public ResponseEntity<ResponsePadrao> get() {

        return ResponseEntity.ok(service.getVotacao());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponsePadrao> getId(@PathVariable Long id){
        return
                ResponseEntity.ok(service.getVotacaoById(id));
    }

    @PostMapping
    public ResponseEntity<ResponsePadrao> postVotacao(@RequestBody VotacaoRequest votacao) throws Exception {
        if (votacao.getDuracaoVotacao() == null) {
            votacao.setDuracaoVotacao(1L);
        }
            return ResponseEntity.ok(service.inserirVotacao(votacao));
        }

}
