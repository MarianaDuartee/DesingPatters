#Factory Method
* Seu objetivo é definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe irá instanciar
* Permite que as subclasses escolham o tipo de objetos a serem criados
* É usado quando uma classe não sabe quais subclasses serão necessárias para criar ou quando uma classe deseja que suas subclasses especifiquem os objetos a serem criados.

## Classes
* Product: Interface em comum para os produtos finais.
As classes que implementam o Factory Method devem retornar produtos que implementam essa interface.
* ConcreteProduct: Produtos concretos que serão retornados pelas classes que implementarem o Factory Method
* Creator: Cria o FactoryMethod abstrato
* ConcreteCreator: Implementa o FactoryMethod informando qual produto sera retornado
