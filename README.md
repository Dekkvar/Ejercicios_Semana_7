# Ejercicios Semana 7

## Ejercicio - Cajero automático
Se trata de un clásico problema de programación. Se necesita hacer un
cajero automático que de servicio a los usuarios de tal manera que, cuando
el usuario pida retirar dinero en efectivo, se muestre por pantalla la cantidad
que se retira y los billetes que se usaron, _evitando que el usuario introduzca
una cifra que no pueda ser retirada del cajero_ (cualquiera que termine en
otra cantidad que no sea 0 o 5 al no existir billetes más pequeños que los de
5 euros). **Las operaciones de retirada no pararán hasta que el usuario lo pida**.
El cajero debe de ser lo más eficiente posible con los billetes que da al
usuario, por ejemplo:

El usuario desea retirar 380 euros y se le da:
- 1 billete de 200
- 1 billete de 100
- 1 billete de 50
- 1 billete de 20
- 1 billete de 10

## Diagrama del ejercicio
![Diagrama del cajero automático](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=ProgramaCajero.drawio#R7Vpbd5s4EP41PKaHq7EfY%2Be6m3S7Tbdp900GBauRkVcIx%2B6vXwnEVRhIA9lkk3NycqRBFtLMN9%2BMNGjWYr07p2CzuiY%2BxJqp%2BzvNOtFM07BNUxN%2Fur9PJa4rBQFFvhxUCG7QTyiFupTGyIdRZSAjBDO0qQo9EobQYxUZoJQ8VIfdEVx96wYEUBHceACr0lvks1UqnZpuIb%2BAKFhlbzYms%2FTJGmSD5U6iFfDJQ0lknWrWghLC0tZ6t4BYKC%2FTy%2B3l%2FhZf3U%2FOf%2Fsz%2Bgf8Nf%2F9y8evR%2BlkZ4%2F5Sb4FCkM27NTSlluAY6kvuVe2zxRISRz6UEyia9Z8xdaYNw3e%2FAEZ20uDg5gRLiKUrUhAQoCvCNnIcXckZHKYIfow9I%2BFYXl%2FiYl3n4rOEMbyHbwnx095L2KU3Oe2ExPkhhCDMVhCPAfefZAsdEEwofxRSEIopvI5GOReisWdFlL%2BMkb338RkH5ys%2Bz1fCO%2Bc7Cq9vez1tIm0XURi6sGWcZZ0DUADKOf77G8uzT%2B%2BxgydYPOCsOuTvy%2BPDDlQbKwEcGnyc0jWkK%2BSD6AQA4a2VS8A0pmCfFz%2B008E8Y2Yeub4ukS9dHvD1atTpCuVvypgxxulZRSiBIyPAKalAPMyRB4igokShtpQElCwBi14FVh5WCEGbzYgUf4Dp7gqhsvY5KqYBxhEkbRwB%2FAeB4AtpAzuWi0mn9pVxc9k96EgLyNjpFWJuGz9sIkrxnmsJRzFEh%2BJovRuP3vVNDKws09UZ28c5%2Fb0dYkc%2FYPuTKdVt5Wo%2BFU2yIaQu7sIPtXRmwltouDrBj0ZX40IakBaCYcpQDLD%2B%2FAOxJh1B5hBUTg%2BzhptoPfE2UsEVdvGS5j6DBmigIrwgUJIVQajK7JexlF3yKgYTJDSGVgjLFRzAfGWv8YDDYEFYBSEvONxy0LajAT%2BShQGvDcpel8S9B7ZIwYcpxpwbKch4ugNEWc6VsRxFeudofDNBX7XdJ4v8jdTs2qId2J%2BLDG3EW4nMds9ibk3Ez8JD3pDTs7V5sceEsTqgZAhH%2FgKRrgmN6LJ1QcwhjjxX67UDaSIr0zQYfXZp%2BJBpx%2BjHczsaIzonPktQMaSkwbvtBu80xnNO1VzDJA4vZnEvM3fOv1y9ooTpmYwzd6pfhyq7wupyYuielMllwOn%2FithmqoVlVxX0CxPi%2FGxfLBGvp8CBkboJ1gm8wndbwTgk704c805abRGK37lLbKcUstZuz%2FRH%2BkfTNd2K2SfGfuJd2rT2qS1Ccbzblsx5iKP1ULKW2o2%2FWbPQ%2FVE3Jk844GojRtK9ruGYQR%2BwORQJFiD0x89mHf5xIvXiZK6bLlMCfxqmQnG0rFdu1523J7XnJPR0qnpewQcJwLOekbAjA9fSAhUM6KFtrC0YwN7MSaZ52ES8f9Lrml%2BXhFNkDzZEk59qkdW4dHhjKPxm1W7aDB6XjSM53uGouuC4HhIb9Iz13EMMRPi10t7L0D1aqGtFluWCIZbGDblCC9a0xVFG33LaKMp2lQxrsYXlcZLuquSx6FAAXeIfZO%2FEO2klp2WtnmvKGaLTlbL7gwuvxpJ8uK6oZVL60WlffDielv%2B1BmBzL7n%2BhKKnJY7nyeeF6xZLUkyauBMN67U4NVifm0iq34pdaCYz8EI9qVh8nh2cMF5przPnElvXVd9fLauws%2FSFQx6GMr87k054sAO1TtV%2B28cZVIvifR1lEMAHttRXNt5BuCroV4F%2Fts44Tz%2FR1%2BtyddwgWngr77M%2BldfvSNObSLL7OdIg2H9%2FTSfY13GoSL2fC9FpeY4NDDOzYYrgLbvNp4b5nad5g%2FAfDB0qncLxaFLVEKFUiGGnoc43KhYGG%2BK24e5FSo4%2Fj%2BUVy2nmS7KxzVrmOMa7xbfbKcWLb58t07%2FBQ%3D%3D)