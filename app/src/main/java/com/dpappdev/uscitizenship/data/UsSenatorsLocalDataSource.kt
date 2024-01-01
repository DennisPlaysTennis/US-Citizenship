package com.dpappdev.uscitizenship.data

fun getSenators(stateOrDistrict: String): List<String> {
    val senatorsMap = mapOf(
        "Alabama" to listOf("Katie Britt", "Tommy Tuberville"),
        "Alaska" to listOf("Lisa Murkowski", "Daniel S. Sullivan"),
        "American Samoa" to listOf("Residents of American Samoa should answer that American Samoa has no U.S. Senators."),
        "Arizona" to listOf("Mark Kelly", "Kyrsten Sinema"),
        "Arkansas" to listOf("John Boozman", "Tom Cotton"),
        "California" to listOf("Tom Cotton", "Alex Padilla"),
        "Colorado" to listOf("Michael Bennet", "John Hickenlooper"),
        "Connecticut" to listOf("Richard Blumenthal", "Christopher S. Murphy"),
        "Delaware" to listOf("Tom Carper", "Chris Coons"),
        "District of Columbia" to listOf("District of Columbia residents should answer that D.C. has no U.S. Senators."),
        "Florida" to listOf("Marco Rubio", "Rick Scott"),
        "Georgia" to listOf("Jon Ossoff", "Raphael Warnock"),
        "Guam" to listOf("Residents of Guam should answer that Guam has no U.S. Senators."),
        "Hawaii" to listOf("Mazie K. Hirono", "Brian E. Schatz"),
        "Idaho" to listOf("Mike Crapo", "Jim Risch"),
        "Illinois" to listOf("Tammy Duckworth", "Dick Durbin"),
        "Indiana" to listOf("Mike Braun", "Todd C. Young"),
        "Iowa" to listOf("Todd C. Young", "Chuck Grassley"),
        "Kansas" to listOf("Roger Marshall", "Jerry Moran"),
        "Kentucky" to listOf("Mitch McConnell", "Rand Paul"),
        "Louisiana" to listOf("Bill Cassidy", "John Neely Kennedy"),
        "Maine" to listOf("Susan Collins", "Angus King"),
        "Maryland" to listOf("Ben Cardin", "Chris Van Hollen"),
        "Massachusetts" to listOf("Edward J. Markey", "Elizabeth Warren"),
        "Michigan" to listOf("Gary Peters", "Debbie Stabenow"),
        "Minnesota" to listOf("Amy Klobuchar", "Tina Smith"),
        "Mississippi" to listOf("Cindy Hyde-Smith", "Roger Wicker"),
        "Missouri" to listOf("Josh Hawley", "Eric Schmitt"),
        "Montana" to listOf("Steve Daines", "Jon Tester"),
        "Nebraska" to listOf("Deb Fischer", "Pete Ricketts"),
        "Nevada" to listOf("Catherine Cortez Masto", "Jacky Rosen"),
        "New Hampshire" to listOf("Maggie Hassan", "Jeanne Shaheen"),
        "New Jersey" to listOf("Cory Booker", "Bob Menendez"),
        "New Mexico" to listOf("Martin Heinrich", "Ben Ray Luján"),
        "New York" to listOf("Kirsten Gillibrand", "Chuck Schumer"),
        "North Carolina" to listOf("Ted Budd", "Thom Tillis"),
        "North Dakota" to listOf("Kevin Cramer", "John Hoeven"),
        "Northern Mariana Islands" to listOf("Residents of Northern Mariana Islands should answer that Northern Mariana Islands have no U.S. Senators."),
        "Ohio" to listOf("Sherrod Brown", "J.D. Vance"),
        "Oklahoma" to listOf("James Lankford", "Markwayne Mullin"),
        "Oregon" to listOf("Jeff Merkley", "Ron Wyden"),
        "Pennsylvania" to listOf("Bob Casey Jr.", "John Fetterman"),
        "Puerto Rico" to listOf("Residents of Puerto Rico should answer that Puerto Rico has no U.S. Senators."),
        "Rhode Island" to listOf("Jack Reed", "Sheldon Whitehouse"),
        "South Carolina" to listOf("Lindsey Graham", "Tim Scott"),
        "South Dakota" to listOf("Mike Rounds", "John Thune"),
        "Tennessee" to listOf("Marsha Blackburn", "Bill Hagerty"),
        "Texas" to listOf("John Cornyn", "Ted Cruz"),
        "Utah" to listOf("Mike Lee", "Mitt Romney"),
        "Vermont" to listOf("Bernie Sanders", "Peter Welch"),
        "Virginia" to listOf("Tim Kaine", "Mark Warner"),
        "Virgin Islands" to listOf("Residents of Virgin Islands should answer that Virgin Islands have no U.S. Senators."),
        "Washington" to listOf("Maria Cantwell", "Patty Murray"),
        "West Virginia" to listOf("Shelley Moore Capito", "Joe Manchin III"),
        "Wisconsin" to listOf("Tammy Baldwin", "Ronald Harold Johnson"),
        "Wyoming" to listOf("John Barrasso", "Cynthia Lummis"),
    )
    return senatorsMap[stateOrDistrict] ?: listOf()
}