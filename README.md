
Exercise 4
==========

Have a peek at the project, it is now a richer library with additional functions.
<br/>

1. Look at the **BookAnalyzer** class. <br/>
   It now gets its keywords from a property file named *'books-analyzer.properties'* (look in the resources package).<br/>
1a. If you run **Main.main()** you will get an exception (do it).<br/>
1b. Fix the code in order for the current **Main.main()** to work<br/>
    (need to load the properties into spring and then enable spring value injection)
<br/>

2. Currently the **BookAnalyzer** class only has **ONE** keyword to define a genre.<br/>
   - Change the **BookAnalyzer** class so that each genre is composed up of MANY keywords.<br/>
     Bellow is a *'keywords appendix'*, add all of these keywords to the *'books-analyzer.properties'* property file.
   - Next, modify the **BookAnalyzer** class to receive a list of keywords per genre.<br/>
     (notice that you do not have to change the *BookAnalyzer.'analyzeBook'* method)<br/>
   - Inside **Main.main()**, uncomment commented code 1 (section with the books), and make sure main passes successfully.<br/>
     Also look into the generated log file and make sure that all created books have a genre.
<br/>

3. You are now going to write a random user generator that generates users and loads them into the data store.<br/>
   Follow these instructions:<br/>
    - Create a property file that has two properties
      - (optional) Number of users to generate
      - (mandatory) A list of email domains (e.g. sc101, google.com)
    - Create a **UserLoader** class that generates users using the **Environment** property reading methodology
      - It reads the properties for number of users to generate and if property does not exist then it generates 5 users
      - It reads the properties the email domains and for every user that it generates, it uses an email domain from the list (round-robin)
<br/>

4. Uncomment the rest of the main method, execute it and make sure it is successful

###N O T I C E
- [ ] How do you make sure that all users where added to the data-store before the main logic fetches all users?


###Keywords Appendix
====================
- romance
  - kiss
  - love
  - flowers
- comedy
  - ha ha ha
  - hahaha
  - joke
  - clown
- horror
  - scream
  - knife
  - mask
- action
  - shoot
  - fight
  - punch
  - kick
  - trapped
- fiction
  - magic
  - wand
