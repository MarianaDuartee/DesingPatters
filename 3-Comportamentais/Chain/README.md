# Chain of Responsability
* Em resumo, um remetente envia uma solicitação para uma CADEIA de objetos
* Sua intenção oficial é de evitar o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação
* Encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate
* É usado quando uma requisição precisa passar por uma sequencia de operações até ser totalmente tratada, ou quando o sistema precisa processar uma requisição em várias etapas diferentes

