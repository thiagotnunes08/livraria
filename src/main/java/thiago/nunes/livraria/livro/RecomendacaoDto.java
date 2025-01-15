package thiago.nunes.livraria.livro;

public record RecomendacaoDto(
       String autor,
       String genero,
       Integer quantidadePaginas,
       Integer anoPublicacao,
       String titulo,
       String resumo,
       String isbn
) {
}
