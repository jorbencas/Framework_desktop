Framework 1.5 de jorge Beneyto Castelló
=====================================================================

Es compleixen els requeriments minims de funcionament, apart he afegit una serie de caracteristiques, que fan que la aplicaccio,
ofereixca un us mes confortable.

Funccionament:

la primera vegada que llançem l'aplicacció carrega la configuraccio per defecte, ens demanara que elegim si volem traballar en dummies, 
o volem treballar normal, una vegada ja hem elegit, el que hem de fer es crear cualquier tipus de usuari, una vegada l'hem creat, 
podem fer les seguent operaccions: llegir, Actualitzar o Borrar.
si escollim llegir, ens apareix un menu, que ens demana si volem escollir entre llegir un usuari, o tots els usuaris,
com nomes hem creat un usuari, escollim llegirlos tots, ens mostra les dades del usuari.

Una vegada ja hem acabat de administrar el usuari, podem cambiar la configuració de tal forma, que podem anar ha la configuracció i podem cambiar el format de la fecha, el idioma, la moneda, els decimals, el tema,
el idioma... tots aquests ajustos, es mostraran inmediatament,no es necessari reiniciar l'aplicaccio per ha vore els camvis, cuant tanquem l'aplicacció,
es guarden les dades dels usuaris, i el guarda la configuracció, de tal forma que al obrir l¡aplicacció, es carregaran les dedes que s'han guardat en els fitxers, 
la primera vegada que l'hem ejecutat.

En el crud del usuari, tambe hi han 2 botons, per a obrir i tancar un fitxer que es vuiga guardar i obrir les dades, i que aparte de guardarse per defecte, que es pujen guardar en un altre lloc.
Els 3 formats en els que treballa l'aplicacció, son xml, json i txt, per defecte este JSON, pero en configurracio, es possible cambiar el format en el que treballa l'aplicacció (s'ha de tindre en conter que si es cambia el format, aixo tambe afectara al obrir i tancar de tots els usuaris),


Configuracio per defecte:

	Format de la data: DD/MM/YYYY
	Tema: GTK
	Decimals: 2
	Moneda: €
	Llenguatje: Anglés
	Tipus de fitxer: json


Millores:

1- Una de les millores que he afegit, es que si accedixes ha configuraccio, mes ajustos, hi ha un boto que s'anomena configuracio per defecte,
mitjançant aquest boto, es possible tornar a les dades que te l'aplicaccio ls primera vegada que s'inicia.

2- s'ha afegit un format per defecte de la fecha, de tal forma, que si el autoguardat fallara, al reiniciar la configuraccio, hi imprimir un usuari,
 voriem un format de fecha.
 
3- Opcció, per ha eliminar tots els usuaris, generats de forma automatica per el arraylist, a la vagada, de tal forma, que no existeix la prcupaccio, 
de que es produixquen incongluensies entre el que es mostra per pantalla i el que es pot llegir dels fitxers.
