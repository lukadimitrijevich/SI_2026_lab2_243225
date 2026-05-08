# SI_2026_lab2_243225
Luka Dimitrijevikj 243225

Ciklomatska kompleksnost se presmetuva taka shto ili od koga ke se nacrta CFG se brojat site regioni vklucuvajki go i nadvoresniot na celiot graf, ili so formulata 
p + 1, kade shto p (predikatni jazki) se if statement , if else statement i if statements vo samite strukturi na loops.

Ciklomatska kompleksnost na searchBookByTitle: 5 
- vkupno 4 if statements + 1

Ciklomatska kompleksnost na borrowBook: 6 
- ima 5 linii so if statement no vo 
if (title.isEmpty() || author.isEmpty()) shto se broi kako 2.

Ciklomatska kompleksnost na returnBook: 5 
- isto 4 if statements + 1

Ciklomatska kompleksnost na printBooksByGenre: 3 
- 2 if statements eden vo for loop strukturata drugiot vo samiot loop i + 1 od formulata

Ciklomatska kompleksnost na countBooksByGenre: 3
-isto kako i drugite

Ciklomatska kompleksnost na countAvailableBooks: 3
- isto

Ciklomatska kompleksnost na printBorrowedBooks: 3
- isto

