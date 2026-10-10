# Questões Teórica

## Questão 01

a ) Verdadeira. Construtores não são herdados, a subclasse pode chamar o construtor da superclasse com `super(...)`, mas não herda ele. Por isso `new Cachorro("Rex")` só funciona se `Cachorro` declarar o próprio construtor.

b ) Falsa. Quem é implementado por herança é o relacionamento “é um” (ex.: Cachorro é um Animal). O relacionamento “tem um” é implementado por composição, quando uma classe tem como atributo um objeto de outra classe (ex.: Carro tem um Motor).

c ) Falsa. Redefinir um método da superclasse com a mesma assinatura é sobrescrita (override), não sobrecarga. Sobrecarga (overload) é ter métodos com o mesmo nome, mas assinaturas diferentes (parâmetros diferentes), na mesma classe ou entre classes.
