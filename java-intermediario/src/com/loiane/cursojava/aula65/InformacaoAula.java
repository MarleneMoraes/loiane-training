package com.loiane.cursojava.aula65;

// Criacao de uma anotacao
@interface InformacaoAula {
    // assinatura da annotation
    String autor();

    int aulaNumero();

    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";
}