# SI_2026_lab2_243225
Luka Dimitrijevikj 243225

2)

CFG - SearchBookByTitle()

<img width="1009" height="1261" alt="SearchBookByTitleCFG drawio" src="https://github.com/user-attachments/assets/2f0a26db-b894-47f6-a803-3be05fc11e90" />


CFG - BorrowBook()

<img width="901" height="1181" alt="BorrowBookCFG drawio" src="https://github.com/user-attachments/assets/44bf1803-378b-4513-b305-f8d444e98eb3" />

3)

Ciklomatska kompleksnost se presmetuva taka shto ili od koga ke se nacrta CFG se brojat site regioni vklucuvajki go i nadvoresniot na celiot graf, ili so formulata 
p + 1, kade shto p (predikatni jazli) se if statement , if else statement i if statements vo samite strukturi na loops.

Ciklomatska kompleksnost na searchBookByTitle: 5 
- vkupno 4 if statements + 1

Ciklomatska kompleksnost na borrowBook: 5 
- vkupno 4 if statements + 1

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

6)

| line | Test 1 | Test 2 | Test 3 | 
|------|--------|--------|--------|
| 1    |    *   |    *   |    *   |   
| 2    |    *   |    *   |    *   |   
| 3    |    *   |        |        |   
| 4    |        |    *   |    *   |   
| 5    |        |    *   |    *   |   
| 6    |        |    *   |    *   |   
| 7    |        |    *   |        |   
| 8    |        |    *   |    *   |   
| 9    |        |        |    *   |   
| 10   |        |    *   |        |   
| end  |    *   |    *   |    *   |  

Za da se ispolni Every Statement kriteriumot za funkcijata searchBookByTitle  potrebni se minimum 3 test sluchai.
1. Prviot test go pokriva scenarioto koga ima greshka poradi prazen vlez.
2. Vtoriot test go pokriva scenarioto koga baranata kniga postoi.
3. Tretiot test go pokriva scenarioto koga niedna kniga vo listata na knigi ne odgovara na baranata pa mora da se vrati null.


8)

| branch     | Test 1 | Test 2 | Test 3 | Test 4 |
|------------|--------|--------|--------|--------|
| 1, 2       |    *   |    *   |    *   |    *   |
| 2, 3       |    *   |        |        |        |
| 3, end     |    *   |        |        |        |
| 2, 4.1     |        |    *   |    *   |    *   |
| 4.1 , 4.2  |        |    *   |    *   |    *   |
| 4.2 , 5    |        |    *   |    *   |    *   |
| 5 , 6      |        |    *   |    *   |        |
| 6, (7,8)   |        |    *   |        |        |
| (7,8) , 10 |        |    *   |        |        |
| 10, end    |        |    *   |        |        |
| 6 , 9      |        |        |    *   |        |
| 9 , end    |        |        | *      |        |
| 5 , 4.3    |        |        |        | *      |
| 4.3 , 4,2  |        |        |        | *      |
| 4.2 , 11   |        |        |        | *      |
| 11, end    |        |        |        | *      |

Za da se ispolni Every Branch kriteriumot za funkcijata borrowBook potrebni se minimum 4 test sluchai.
1. Prviot test go pokriva scenarioto koga barem edno od title i author e prazno.
2. Vtoriot test go pokriva scenarioto koga baranata kniga ja ima vo library i ne e borrowed.
3. Tretiot test go pokriva scenarioto koga baranata kniga ja ima vo library no e borrowed. 
4. Chetvrtiot test go pokriva scenarioto koga baranata kniga voopsto ja nema vo library (book not found).


10)

| borrowBookMultipleConditionTest |                                                                                                  |
|---------------------------------|--------------------------------------------------------------------------------------------------|
| **T  → и `title` е празно, нема потреба `author` да се провери → методот фрла `IllegalArgumentException`          |
| **F или T** → `title` е внесен, но `author` е празен → се фрла `IllegalArgumentException`       |
| **F или F** → и `title` и `author` се валидни → извршувањето продолжува и книгата се позајмува |

Za ovoj kriterium potrebni se minimum 3 test sluchai bidejki kaj || potrebno e barem 1 uslov da e true za celiot izraz da e true, pa taka ako prviot uslov e tocen vtoriot ne ni mora da se proveri zatoa gi minimizirame dvata uslovi vo eden uslov, drugite 2 test sluchai mora da se proverat bidejki ako prviot uslov e false vrednosta na izrazot zavisi direktno od vtoriot uslov.


| searchBookMultipleConditionTest |                                                                                                 |
|---------------------------------|-------------------------------------------------------------------------------------------------|
| T && T** → насловот е точен и книгата е слободна → книгата се внесува во резултатите         |
| **T && F** → насловот се совпаѓа, но книгата е веќе позајмена → не се внесува во резултатите   |
| F  → насловот не одговара, вториот услов нема потреба да се провери → не се додава во листата       |

Za ovoj kriterium potrebni se minimum 3 test sluchai bidejki kaj && potrebno e barem eden od uslovite da e false za cel izraz da e false, pa zatoa ako prviot uslov e false ne ni mora da go proveruvame vtoriot, zatoa gi minimizirame F && F i F && T vo samo edno F, drugite 2 test sluchai mora da se proverat bidejki ako prviot uslov e true togash vrednosta na celiot izraz zavisi direktno od vrednosta na vtoriot uslov.

