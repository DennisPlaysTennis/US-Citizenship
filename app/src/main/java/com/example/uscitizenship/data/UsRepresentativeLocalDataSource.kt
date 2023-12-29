package com.example.uscitizenship.data

fun getUsRepresentatives(stateOrDistrict: String): List<String> {
    val usRepMap = mapOf(
        "Alabama" to listOf(
            "Barry Moore",
            "Dale Strong",
            "Gary Palmer",
            "Jerry Carl",
            "Mike Rogers",
            "Robert Aderholt",
            "Terri Sewell",
        ),
        "Alaska" to listOf(
            "Mary Peltola"
        ),
        "American Samoa" to listOf(
            "Aumua Amata Radewagen"
        ),
        "Arizona" to listOf(
            "Andy Biggs",
            "David Schweikert",
            "Debbie Lesko",
            "Elijah Crane",
            "Greg Stanton",
            "Juan Ciscomani",
            "Paul Gosar",
            "Raul Grijalva",
            "Ruben Gallego",
        ),
        "Arkansas" to listOf(
            "Bruce Westerman",
            "Eric Crawford",
            "J. French Hill",
            "Steve Womack",
        ),
        /////////// sorted^^ /////////
        "California" to listOf(
            "Doug LaMalfa",
            "Jared Huffman",
            "Kevin Kiley",
            "Mike Thompson",
            "Tom McClintock",
            "Ami Bera",
            "Doris Matsui",
            "John Garamendi",
            "Josh Harder",
            "Mark DeSaulnier",
            "Nancy Pelosi",
            "Barbara Lee",
            "John Duarte",
            "Eric Swalwell",
            "Kevin Mullin",
            "Anna Eshoo",
            "Ro Khanna",
            "Zoe Lofgren",
            "Jimmy Panetta",
            "Kevin McCarthy",
            "Jim Costa",
            "David Valadao",
            "Jay Obernolte",
            "Salud Carbajal",
            "Raul Ruiz",
            "Julia Brownley",
            "Mike Garcia",
            "Judy Chu",
            "Tony Cardenas",
            "Adam Schiff",
            "Grace Napolitano",
            "Brad Sherman",
            "Pete Aguilar",
            "Jimmy Gomez",
            "Norma Torres",
            "Ted Lieu",
            "Sydney Kamlager-Dove",
            "Linda Sanchez",
            "Mark Takano",
            "Young Kim",
            "Ken Calvert",
            "Robert Garcia",
            "Maxine Waters",
            "Nanette Barragan",
            "Michelle Steel",
            "J. Luis Correa",
            "Katie Porter",
            "Darrell Issa",
            "Mike Levin",
            "Scott Peters",
            "Sara Jacobs",
            "Juan Vargas",
        ),
        "Colorado" to listOf(
            "Diana DeGette",
            "Joe Neguse",
            "Lauren Boebert",
            "Ken Buck",
            "Doug Lamborn",
            "Jason Crow",
            "Brittany Pettersen",
            "Yadira Caraveo",
        ),
        "Connecticut" to listOf(
            "John Larson",
            "Joe Courtney",
            "Rosa DeLauro",
            "James Himes",
            "Jahana Hayes",
        ),
        "Delaware" to listOf(
            "Lisa Blunt Rochester"
        ),
        "District of Columbia" to listOf(
            "Eleanor Norton"
        ),
        "Florida" to listOf(
            "Matt Gaetz",
            "Neal Dunn",
            "Kat Cammack",
            "Aaron Bean",
            "John Rutherford",
            "Michael Waltz",
            "Cory Mills",
            "Bill Posey",
            "Darren Soto",
            "Maxwell Frost",
            "Daniel Webster",
            "Gus Bilirakis",
            "Anna Paulina Luna",
            "Kathy Castor",
            "Laurel Lee",
            "Vern Buchanan",
            "W. Gregory Steube",
            "Scott Franklin",
            "Byron Donalds",
            "Sheila Cherfilus-McCormick",
            "Brian Mast",
            "Lois Frankel",
            "Jared Moskowitz",
            "Frederica Wilson",
            "Debbie Wasserman Schultz",
            "Mario Diaz-Balart",
            "Maria Salazar",
            "Carlos Gimenez",
        ),
        "Georgia" to listOf(
            "Earl Carter",
            "Sanford Bishop",
            "A. Drew Ferguson",
            "Henry Johnson",
            "Nikema Williams",
            "Richard McCormick",
            "Lucy McBath",
            "Austin Scott",
            "Andrew Clyde",
            "Mike Collins",
            "Barry Loudermilk",
            "Rick Allen",
            "David Scott",
            "Marjorie Greene",
        ),
        "Guam" to listOf(
            "James Moylan"
        ),
        "Hawaii" to listOf(
            "Ed Case",
            "Jill Tokuda",
        ),
        "Idaho" to listOf(
            "Russ Fulcher",
            "Michael Simpson",
        ),
        "Illinois" to listOf(
            "Jonathan Jackson",
            "Robin Kelly",
            "Delia Ramirez",
            "Jesus Garcia",
            "Mike Quigley",
            "Sean Casten",
            "Danny Davis",
            "Raja Krishnamoorthi",
            "Janice Schakowsky",
            "Bradley Schneider",
            "Bill Foster",
            "Mike Bost",
            "Nikki Budzinski",
            "Lauren Underwood",
            "Mary Miller",
            "Mary Miller",
            "Eric Sorensen",
        ),
        "Indiana" to listOf(
            "Frank Mrvan",
            "Rudy Yakym",
            "Jim Banks",
            "James Baird",
            "Victoria Spartz",
            "Greg Pence",
            "Andre Carson",
            "Larry Bucshon",
            "Erin Houchin",
        ),
        "Iowa" to listOf(
            "Mariannette Miller-Meeks",
            "Ashley Hinson",
            "Zachary Nunn",
            "Randy Feenstra",
        ),
        "Kansas" to listOf(
            "Tracey Mann",
            "Jake LaTurner",
            "Sharice Davids",
            "Ron Estes",
        ),
        "Kentucky" to listOf(
            "James Comer",
            "Brett Guthrie",
            "Morgan McGarvey",
            "Thomas Massie",
            "Harold Rogers",
            "Andy Barr",
        ),
        "Louisiana" to listOf(
            "Steve Scalise",
            "Troy Carter",
            "Clay Higgins",
            "Mike Johnson",
            "Julia Letlow",
            "Garret Graves",
        ),
        "Maine" to listOf(
            "Chellie Pingree",
            "Jared Golden",
        ),
        "Maryland" to listOf(
            "Andy Harris",
            "C.A. Dutch Ruppersberger",
            "John Sarbanes",
            "Glenn Ivey",
            "Steny Hoyer",
            "David Trone",
            "Kweisi Mfume",
            "Jamie Raskin",
        ),
        "Massachusetts" to listOf(
            "Richard Neal",
            "James McGovern",
            "Lori Trahan",
            "Jake Auchincloss",
            "Katherine Clark",
            "Seth Moulton",
            "Ayanna Pressley",
            "Stephen Lynch",
            "William Keating",
        ),
        "Michigan" to listOf(
            "Jack Bergman",
            "John Moolenaar",
            "Hillary Scholten",
            "Bill Huizenga",
            "Tim Walberg",
            "Debbie Dingell",
            "Elissa Slotkin",
            "Daniel Kildee",
            "Lisa McClain",
            "John James",
            "Haley Stevens",
            "Rashida Tlaib",
            "Shri Thanedar",
        ),
        "Minnesota" to listOf(
            "Brad Finstad",
            "Angie Craig",
            "Dean Phillips",
            "Betty McCollum",
            "Ilhan Omar",
            "Tom Emmer",
            "Michelle Fischbach",
            "Pete Stauber",
        ),
        "Mississippi" to listOf(
            "Trent Kelly",
            "Bennie Thompson",
            "Michael Guest",
            "Mike Ezell",
        ),
        "Missouri" to listOf(
            "Cori Bush",
            "Ann Wagner",
            "Blaine Luetkemeyer",
            "Mark Alford",
            "Emanuel Cleaver",
            "Sam Graves",
            "Eric Burlison",
            "Jason Smith",
        ),
        "Montana" to listOf(
            "Ryan Zinke",
            "Matthew Rosendale",
        ),
        "Nebraska" to listOf(
            "Mike Flood",
            "Don Bacon",
            "Adrian Smith",
        ),
        "Nevada" to listOf(
            "Dina Titus",
            "Mark Amodei",
            "Susie Lee",
            "Steven Horsford",
        ),
        "New Hampshire" to listOf(
            "Chris Pappas",
            "Ann Kuster",
        ),
        "New Jersey" to listOf(
            "Donald Norcross",
            "Jefferson Van Drew",
            "Andy Kim",
            "Christopher Smith",
            "Josh Gottheimer",
            "Frank Pallone",
            "Thomas Kean",
            "Robert Menendez",
            "Bill Pascrell",
            "Donald Payne",
            "Mikie Sherrill",
            "Bonnie Watson Coleman",
        ),
        "New Mexico" to listOf(
            "Melanie Stansbury",
            "Gabe Vasquez",
            "Teresa Leger Fernandez",
        ),
        "New York" to listOf(
            "Nick LaLota",
            "Andrew Garbarino",
            "George Santos",
            "Anthony D'Esposito",
            "Gregory Meeks",
            "Grace Meng",
            "Nydia Velazquez",
            "Hakeem Jeffries",
            "Yvette Clarke",
            "Daniel Goldman",
            "Nicole Malliotakis",
            "Jerrold Nadler",
            "Adriano Espaillat",
            "Alexandria Ocasio-Cortez",
            "Ritchie Torres",
            "Jamaal Bowman",
            "Michael Lawler",
            "Patrick Ryan",
            "Marcus Molinaro",
            "Paul Tonko",
            "Elise Stefanik",
            "Brandon Williams",
            "Nicholas Langworthy",
            "Claudia Tenney",
            "Joseph Morelle",
            "Brian Higgins",
        ),
        "North Carolina" to listOf(
            "Donald Davis",
            "Deborah Ross",
            "Gregory Murphy",
            "Valerie Foushee",
            "Virginia Foxx",
            "Kathy Manning",
            "David Rouzer",
            "Dan Bishop",
            "Richard Hudson",
            "Patrick McHenry",
            "Chuck Edwards",
            "Alma Adams",
            "Wiley Nickel",
            "Jeff Jackson",
        ),
        "North Dakota" to listOf(
            "Kelly Armstrong"
        ),
        "Northern Mariana Islands" to listOf(
            "Gregorio Sablan"
        ),
        "Ohio" to listOf(
            "Greg Landsman",
            "Brad Wenstrup",
            "Joyce Beatty",
            "Jim Jordan",
            "Robert Latta",
            "Bill Johnson",
            "Max Miller",
            "Warren Davidson",
            "Marcy Kaptur",
            "Michael Turner",
            "Shontel Brown",
            "Troy Balderson",
            "Emilia Sykes",
            "David Joyce",
            "Mike Carey",
        ),
        "Oklahoma" to listOf(
            "Kevin Hern",
            "Josh Brecheen",
            "Frank Lucas",
            "Tom Cole",
            "Stephanie Bice",
        ),
        "Oregon" to listOf(
            "Suzanne Bonamici",
            "Cliff Bentz",
            "Earl Blumenauer",
            "Val Hoyle",
            "Lori Chavez-DeRemer",
            "Andrea Salinas",
        ),
        "Pennsylvania" to listOf(
            "Brian Fitzpatrick",
            "Brendan Boyle",
            "Dwight Evans",
            "Madeleine Dean",
            "Mary Scanlon",
            "Chrissy Houlahan",
            "Susan Wild",
            "Matt Cartwright",
            "Daniel Meuser",
            "Scott Perry",
            "Lloyd Smucker",
            "Summer Lee",
            "John Joyce",
            "Guy Reschenthaler",
            "Glenn Thompson",
            "Mike Kelly",
            "Christopher Deluzio",
        ),
        "Puerto Rico" to listOf(
            "Jenniffer Gonzalez-Colon"
        ),
        "Rhode Island" to listOf(
            "Gabe Amo",
            "Seth Magaziner",
        ),
        "South Carolina" to listOf(
            "Nancy Mace",
            "Joe Wilson",
            "Jeff Duncan",
            "William Timmons",
            "Ralph Norman",
            "James Clyburn",
            "Russell Fry",
        ),
        "South Dakota" to listOf(
            "Dusty Johnson"
        ),
        "Tennessee" to listOf(
            "Diana Harshbarger",
            "Tim Burchett",
            "Charles Fleischmann",
            "Scott DesJarlais",
            "Andrew Ogles",
            "John Rose",
            "Mark Green",
            "David Kustoff",
            "Steve Cohen",
        ),
        "Texas" to listOf(
            "Nathaniel Moran",
            "Dan Crenshaw",
            "Keith Self",
            "Pat Fallon",
            "Lance Gooden",
            "Jake Ellzey",
            "Lizzie Fletcher",
            "Morgan Luttrell",
            "Al Green",
            "Michael McCaul",
            "August Pfluger",
            "Kay Granger",
            "Ronny Jackson",
            "Randy Weber",
            "Monica De La Cruz",
            "Veronica Escobar",
            "Pete Sessions",
            "Sheila Jackson Lee",
            "Jodey Arrington",
            "Joaquin Castro",
            "Chip Roy",
            "Troy Nehls",
            "Tony Gonzales",
            "Beth Van Duyne",
            "Roger Williams",
            "Michael Burgess",
            "Michael Cloud",
            "Henry Cuellar",
            "Sylvia Garcia",
            "Jasmine Crockett",
            "John Carter",
            "Colin Allred",
            "Marc Veasey",
            "Vicente Gonzalez",
            "Greg Casar",
            "Brian Babin",
            "Lloyd Doggett",
            "Wesley Hunt",
        ),
        "Utah" to listOf(
            "Blake Moore",
            "Celeste Maloy",
            "John Curtis",
            "Burgess Owens",
        ),
        "Vermont" to listOf(
            "Becca Balint"
        ),
        "Virginia" to listOf(
            "Robert Wittman",
            "Jennifer Kiggans",
            "Robert Scott",
            "Jennifer McClellan",
            "Bob Good",
            "Ben Cline",
            "Abigail Spanberger",
            "Donald Beyer",
            "H. Morgan Griffith",
            "Jennifer Wexton",
            "Gerald Connolly",
        ),
        "Virgin Islands" to listOf(
            "Stacey Plaskett"
        ),
        "Washington" to listOf(
            "Suzan DelBene",
            "Rick Larsen",
            "Marie Perez",
            "Dan Newhouse",
            "Cathy Rodgers",
            "Derek Kilmer",
            "Pramila Jayapal",
            "Kim Schrier",
            "Adam Smith",
            "Marilyn Strickland",
        ),
        "West Virginia" to listOf(
            "Carol Miller",
            "Alexander Mooney",
        ),
        "Wisconsin" to listOf(
            "Bryan Steil",
            "Mark Pocan",
            "Derrick Van Orden",
            "Gwen Moore",
            "Scott Fitzgerald",
            "Glenn Grothman",
            "Thomas Tiffany",
            "Mike Gallagher",
        ),
        "Wyoming" to listOf(
            "Harriet Hageman"
        ),
    )
    return usRepMap[stateOrDistrict] ?: listOf()
}