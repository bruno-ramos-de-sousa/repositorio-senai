algoritmo "semnome"
var
n1, n2, media: real

inicio
escreva ("Digite a 1ª nota: ")
leia (n1)

limpatela

escreva ("Digite a 2ª nota: ")
leia (n2)

limpatela

media <- (n1 + n2)/2

se (media>=6) entao
   escreva ("Sua média é ", media,", e você foi aprovado!!")
   senao
   escreva ("Sua média é ", media,", mas você reprovou!!")
fimse

fimalgoritmo
