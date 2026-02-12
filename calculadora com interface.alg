algoritmo "semnome"
var

num1,num2,soma,sub,multi,cond,divi: real

inicio

escreva ("Digite um número para o calculo: ")
leia (num1)

escreva ("Digite o segundo número para a operação: ")
leia (num2)

limpatela

escreval ("Qual a operação que você deseja fazer?")
escreval ("(1) Soma")
escreval ("(2) Subtração")
escreval ("(3) Divisão")
escreval ("(4) Multiplicação")
escreval ("(5) Raiz do primeiro número")
escreval ("(6) Raiz do segundo número")
leia (cond)

soma <- num1 + num2
sub <- num1 + num2
divi <- num1 / num2
multi <- num1 * num2

repita

limpatela

escreval ("Qual a operação que você deseja fazer?")
escreval ("(1) Soma")
escreval ("(2) Subtração")
escreval ("(3) Divisão")
escreval ("(4) Multiplicação")
escreval ("(5) Raiz do primeiro número")
escreval ("(6) Raiz do segundo número")
leia (cond)

ate (cond <7)

limpatela

se (cond=1) entao
escreva ("A soma dos dois números é: ",soma)
senao
se (cond=2) entao
escreva ("A subtração dos dois números é: ",sub)
senao
se (cond=3) entao
escreva ("A divisão dos dois números é: ",divi)
senao
se (cond=4) entao
escreva ("A multiplicação dos dois números é: ",multi)
senao
se (cond=5) entao
escreva ("A raiz quadrada do primeiro número é: ",raizq (num1))
senao
se (cond=6) entao
escreva ("A raiz quadrada do segundo número é: ",raizq (num2))
senao

fimse
fimse
fimse
fimse
fimse
fimse

fimalgoritmo
