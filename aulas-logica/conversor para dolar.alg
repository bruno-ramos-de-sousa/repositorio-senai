algoritmo "Conversor para dolar"
var
cont, qutd: inteiro
r, d, valor: real
inicio

cont <- 1
escreval ("------------------------------------------------------------------")
escreval ("!!!!!!!!!!!!!!!!!!Sistema de Conversão de Moedas!!!!!!!!!!!!!!!!!!")
escreval ("")
escreva ("quantas conversões você deseja fazer? ")
leia (qutd)

limpatela

escreval ("qual o valor do dolar hoje? ")
escreva ("R$")
leia (d)

limpatela

enquanto (cont <= qutd) faca

   escreval ("Qual o valor em reais que você deseja converter? ")
   escreva ("R$")
   leia (r)

   limpatela
   
   valor <- r / d

   escreval ("R$", r, " em dolar é: US$", valor)
   escreval ("")
   cont <- cont + 1

fimenquanto

escreval ("----------------------Agradecemos sua visita----------------------")
escreval ("------------------------------------------------------------------")

fimalgoritmo
