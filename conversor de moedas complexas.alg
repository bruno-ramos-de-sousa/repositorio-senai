algoritmo "Conversor complexo"
var
moeda: caractere
cont, qutd: inteiro
r, d, valor: real
inicio

cont <- 0
escreval ("------------------------------------------------------------------")
escreval ("!!!!!!!!!!!!!!!!!!Sistema de Conversão de Moedas!!!!!!!!!!!!!!!!!!")
escreval ("")
escreva ("quantas conversões você deseja fazer? ")
leia (qutd)

limpatela

escreval ("Para qual moeda você gostaria de converter? ")
escreval ("Dólar (USD)")
escreval ("Euro (€)")
escreval ("Libra (£)")
escreval ("Yen (¥)")
leia (moeda)

limpatela

enquanto cont < qutd faca
   escolha (moeda)

   caso "Dólar", "dolar", "dólar", "DOLAR", "DÓLAR", "USD", "usd", "1"

      se cont = 0 entao
         escreval ("Qual o valor do dólar atualmete?")
         leia (d)
         limpatela
      fimse

      escreval ("Qual o valor em R$ que você deseja converter: ")
      leia (r)

      limpatela

      valor <- r / d
      escreval ("R$", r," em dólar é: USD", valor)
      escreval ("")
      cont <- cont + 1

   caso "euro", "Euro", "€", "2"

      se cont = 0 entao
         escreval ("Qual o valor do euro atualmete?")
         leia (d)
         limpatela
      fimse

      escreval ("Qual o valor em R$ que você deseja converter: ")
      leia (r)

      limpatela

      valor <- r / d
      escreval ("R$", r," em euro é: €", valor)
      escreval ("")
      cont <- cont + 1

   caso "libra", "Libra", "£", "LIBRA", "3"

      se cont = 0 entao
         escreval ("Qual o valor da libra atualmete?")
         leia (d)
         limpatela
      fimse

      escreval ("Qual o valor em R$ que você deseja converter: ")
      leia (r)

      limpatela

      valor <- r / d
      escreval ("R$", r," em libras é: £", valor)
      escreval ("")
      cont <- cont + 1

   caso "Yen", "yen", "¥", "YEN", "4"

      se cont = 0 entao
         escreval ("Qual o valor do yen atualmete?")
         leia (d)
         limpatela
      fimse

      escreval ("Qual o valor em R$ que você deseja converter: ")
      leia (r)

      limpatela

      valor <- r / d
      escreval ("R$", r," em yen é: ¥", valor)
      escreval ("")
      cont <- cont + 1

   fimescolha
fimenquanto

escreval ("----------------------Agradecemos sua visita----------------------")
escreval ("------------------------------------------------------------------")

fimalgoritmo
