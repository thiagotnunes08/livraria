package thiago.nunes.livraria.livro;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    private final ChatClient chatClient;

    public LivroController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping
    public RecomendacaoDto get(){

        return chatClient
                .prompt()
                .user("me recomende um livro essencial para aprender java!")
                .call()
                .entity(RecomendacaoDto.class);
    }
}
