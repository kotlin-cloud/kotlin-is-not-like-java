doctype

html
  head
    title "Kotlin is not like Java"
    meta (:charset utf-8)
    link (:rel stylesheet) (:href css/style.css)
    link (:class codestyle) (:rel stylesheet) (:href css/androidstudio.css)
    script (:src js/highlight.pack.js)
    script (:src js/kotlin.js)
    script (:src js/java.js)
    script "hljs.configure({languages: []});hljs.initHighlightingOnLoad();"

  body
    a (:target _blank)
      :href https://github.com/kotlin-cloud/kotlin-is-not-like-java
      img#fork-me (:src http://luckymerlin.me/images/fork-me.png)
    #note
      = "Kotlin is NOT Like Java"

    .section
      .title "BASIC SYNTAX"
      .case (.name "Properties") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/properties.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/properties.java)
      .case (.name "String Templates") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/string-template.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/string-template.java)
      .case (.name "String Templates") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/string-template.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/string-template.java)
      .case (.name "Get and Set") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/get-set.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/get-set.java)
      .case (.name "Data Class") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/data-class.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/data-class.java)
      .case (.name "String Templates") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/string-template.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/string-template.java)

    .section
      .title "NULL SAFETY"
      .case (.name "Null Safety") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/null-safety.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/null-safety.java)

    .section
      .title "FUNCTION AND LAMBDA"
      .case (.name "Functions") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/functions.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/functions.java)
      .case (.name "Lambda") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/lambda.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/lambda.java)
      .case (.name "SAM Conversion") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/sam.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/sam.java)

    .section
      .title "COLLECTIONS"
      .case (.name "Using Collections") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/collections.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/collections.java)

    .section
      .title "EXTESIONS"
      .case (.name "Extension: String") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/extensions.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/extensions.java)
      .case (.name "Simple reified Extension") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/extensions-2.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/extensions-2.java)
      .case (.name "Extensions: Permission") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/extensions-3.kt)
      .case (.name "Extensions: Make Phone Call") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/extensions-4.kt)

    .section
      .title "DELEGATES"
      .case (.name "Lazy Delegation 1") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/lazy.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/lazy.java)
      .case (.name "Lazy Delegation 2") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/lazy-2.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/lazy-2.java)
      .case (.name "Butterknife") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/butterknife.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/butterknife.java)
      .case (.name "Observable") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/observable.kt)
      .case (.name "Implement willSet and didSet") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/will-did-set.kt)

    .section
      .title "SMART CAST AND PATTERN MATCHING"
      .case $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/pattern-matching.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/pattern-matching.java)

    .section
      .title "STANDARD LIBRARY"
      .case (.name "let") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/s-let.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/s-let.java)
      .case $ .pair 
        .kcard (.lang "Source Code") $ pre.code $ code.java (@insert ../code/s-let-i.kt)
      .case (.name "apply") $ .pair
        .card (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/s-apply.kt)
        .card (.lang Java) $ pre.code $ code.java (@insert ../code/s-apply.java)
      .case $ .pair 
        .kcard (.lang "Source Code") $ pre.code $ code.java (@insert ../code/s-apply-i.kt)
      .case (.name "with") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/s-with.kt)
      .case $ .pair 
        .kcard (.lang "Source Code") $ pre.code $ code.java (@insert ../code/s-with-i.kt)

    .section
      .title "DSL"
      .case (.name "Bundle") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/dsl-bundle.kt)
      .case (.name "Converter") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/dsl-converter.kt)
      .case (.name "Retrofit") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/dsl-retrofit.kt)

    .section
      .title "QUIZ"
      .case (.name "step 1: solve this quiz. step 2: ???. step 3: profit.") $ .pair
        .kcard (.lang Kotlin) $ pre.code $ code.kotlin (@insert ../code/quiz.kt)




