algoritmo "validacao"
var
usuario, senha: literal

inicio
escreva ("Digite seu úsuario: ")
leia (usuario)

limpatela

escreva ("Digite sua senha: ")
leia (senha)

se ((usuario <> "orrico") ou (senha <> "1234")) entao
   limpatela
   escreval ("-----usuario ou senha incorreta-----")
   escreval ("---------Tente novamente...---------")
   
   repita
   
   escreva ("Digite seu úsuario: ")
   leia (usuario)

   limpatela

   escreva ("Digite sua senha: ")
   leia (senha)
   
   limpatela
   
   escreval ("-----usuario ou senha incorreta-----")
   escreval ("---------Tente novamente...---------")
   ate ((usuario = "orrico") e (senha = "1234"))
fimse

limpatela

escreva ("Olá, ",usuario," seja bem vindo!!")

fimalgoritmo
