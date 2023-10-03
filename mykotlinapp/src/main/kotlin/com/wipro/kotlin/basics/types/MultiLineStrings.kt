package com.wipro.kotlin.basics.types


fun main() {
    //traditonal style: java style
    var doc = "<html>" +
            "<head>" +
            "<title>Home</title>" +
            "</head>" +
            "<body>" +
            "</body>" +
            "</html>"
    println(doc)
    //kotlin style
    var message = "Hello!!1"
    var newDoc = """
        <html>
         <head>
         <title>Home</title>
         </head>
         <body>
         <h1>${message}</h1>
         </body>
        </body>
    """.trimIndent()
    println(newDoc)
}