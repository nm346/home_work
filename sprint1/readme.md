<link rel='stylesheet' href='web/swiss.css'/>

# Sprint 1: Agile practices and build automation

In this phase, we are going to focus on the main phases and principles behind common software development methodologies. We will analyse common software development practices from a critical point of view and we will use specific tools to manage software development. Namely, we will use Gradle for automating software builds.

The sprint for the following two weeks is structured as follows:
1. We will revise the Eclipse IDE (named Spring Tool Suite in the labs)
2. We will set up the GitHub repository
3. We will cover software development methodologies.
4. We will learn Groovy, a scripting language used to program Gradle build scripts.
5. We will learn how to program Gradle build scripts using Groovy for Java projects.

The spreadsheet containing the **sprint backlog** for this phase can be used to track the progress made throughout the sprint in order to help you manage your time.

At the end of this page you will find a jargon buster on terms that may be new to you.

## 1. Eclipse (revision) - optional but recommended

* :movie_camera: [Why Eclipse?](https://app.pluralsight.com/player?course=eclipse-guided-tour-part1&author=tod-gentille&name=eclipse-guided-tour-part1-m1&clip=2&mode=live)
* :movie_camera: [The workspace - launching Eclipse](https://app.pluralsight.com/player?course=eclipse-guided-tour-part1&author=tod-gentille&name=eclipse-guided-tour-part1-m1&clip=7&mode=live)
* :movie_camera: [Eclipse workbench overview (skip c++ sections)](https://app.pluralsight.com/player?course=eclipse-guided-tour-part1&author=tod-gentille&name=eclipse-guided-tour-part1-m2&clip=0&mode=live)
* :movie_camera: [Demo: Importing Java Sample Files: importing files into your workspace](https://app.pluralsight.com/player?course=eclipse-guided-tour-part1&author=tod-gentille&name=eclipse-guided-tour-part1-m3&clip=1&mode=live)
* :movie_camera: [Package/project explorer (first three minutes)](https://app.pluralsight.com/player?course=eclipse-guided-tour-part1&author=tod-gentille&name=eclipse-guided-tour-part1-m3&clip=3&mode=live)

## 2. Setting up your GitHub repository

Follow these steps:
* Create an account on GitHub if you don't have one already
* Accept [this invitation]() with your GitHub account
* On the STS (Eclipse):
  * Create a workspage
  * In Git perspective: clone repository using the url of your repository `https://github.com/uol-inf/co2006-16-17-<username>.git`, where `<username>` corresponds to your GitHub username.
  * In the Java perspective, in your workspace, import the project `Groovy_exercises` as an Eclipse project
  * Solve the exercises in the `src` folder
  * You can check where your project is in the filesystem by using the terminal console: 
    * `right click on project > show in > terminal`
    * run the command `pwd`

## 3. Software develoment methodologies

In this unit, we are going to become familiar with the main phases of software development and the principles behind the main software development methodologies. In the lectures below, we are going to focus on:
* waterfall methodology:
  * software project lifecycle and main phases of software development
  * pros/cons
  * where it is recommended/discouraged to use it
* V-model:
  * how testing complements each phase of the waterfall model
  * pros/cons
  * where it is recommended/discouraged to use it
* agile methodologies:
  * what are the core values?
  * what are the main principles of the agile manifesto?
  * what are the common misconceptions and mistakes (risks) to be avoided?
  * pros/cons
  * where it is recommended/discouraged to use it

### 4. Pluralsight resources
* :movie_camera: [Waterfall Fundamentals and Its Problems](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m2&clip=0&mode=live)
* :movie_camera: [What is agile all about?](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m3&clip=0&mode=live)
* :movie_camera: [Common agile misconceptions](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m4&clip=0&mode=live)
* :movie_camera: [Advantages and disadvantages](https://app.pluralsight.com/player?course=agile-fundamentals&author=stephen-haunts&name=agile-fundamentals-m5&clip=2&mode=live)
* :black_nib: [Learning check](https://app.pluralsight.com/library/courses/agile-fundamentals/learning-check)

## 5. Groovy

In this unit, we are going to cover the basics of Groovy's syntax so as to be able to read and write Gradle build scripts. We are going to focus on:
* What is Groovy? What are its main features?
* How to write and run Groovy scripts?
* Working with collections and ranges
* Writing and using functions
* Writing and using closures
* Differences between functions and closures
* Dynamic capabilities

### Lectures

* :movie_camera:  [Introduction](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m1&clip=0&mode=live): General introduction and motivation for scripting languages.
* :movie_camera: [Basic syntax](https://app.pluralsight.com/player?course=groovy-fundamentals&author=jeremy-jarrell&name=groovy-fundamentals-m2&clip=0&mode=live): You should get familiar with the syntax in order to be able to read and customize Gradle build scripts.
* :computer: Check the [examples used in Pluralsight](https://app.pluralsight.com/library/courses/groovy-fundamentals/exercise-files).

### Exercises
* :black_nib: [Learning check](https://app.pluralsight.com/library/courses/groovy-fundamentals/learning-check)
* :computer: [Exercises with Groovy](./Groovy_exercises/readme.md)

## Automating builds with Gradle

In this unit, we are going to focus on automating software builds with Gradle based on what we have learnt about software development methodologies and Groovy. In particular, when going through Pluralsight resources, we are going to focus on:
* What is Gradle?
  * What is the Gradle wrapper?
* What is a Gradle task?
  * Writing and running tasks.
  * Specifying task dependencies.
* What is a typed task?
  * Using the copy task.
* How to use Gradle to build a Java project?
  * What is a Gradle plugin?
  * Tasks offered by the Java plugin
  * What is the Gradle daemon
  * **Multi-project builds are not assessed**
* How does Gradle handle library dependencies?
  * What is a repository?
  * Using repositories of libraries
* How do you run Java tests from Gradle?

### Pluralsight resources

* :movie_camera: [Introduction](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m1&clip=0&mode=live)
* :movie_camera: [Basic Gradle Tasks](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m2&clip=0&mode=live): Explains what you can do in a Gradle build file.
* :movie_camera: [Task dependencies](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m3&clip=0&mode=live): Explains how to order tasks.
* :movie_camera: [Typed tasks](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m4&clip=0&mode=live)
* :movie_camera: [Building a Java project](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m5&clip=0&mode=live): Explains how to build a Java project.
* :movie_camera: [Dependencies](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m6&clip=0&mode=live): Explains how to import depedencies (jars, other libraries, etc.) from repositories.
* :movie_camera: [Testing](https://app.pluralsight.com/player?course=gradle-fundamentals&author=kevin-jones&name=gradle-fundamentals-m7&clip=0&mode=live): Explains how to run tests. We will see how to write tests in the following sprint.
* :black_nib: [Learning check](https://app.pluralsight.com/library/courses/gradle-fundamentals/learning-check)
* :computer: Check the [examples used in Pluralsight](https://app.pluralsight.com/library/courses/gradle-fundamentals/exercise-files).

### Exercises

* :computer: [Exercise 1](./Gradle_ex01/readme.md) (**Gradle tasks and dependencies**)
* :computer: [Exercise 2](./Gradle_ex02/readme.md) (**Java builds and Java libraries**)

## Jargon buster <a name="jargon"></a>

| term  | definition | source |
|-------|------------|--------|
| software development methodology | A methodology specifies the process to be executed, usually as a set of related activities, tasks and/or techniques, together with the work products that must be manipulated (created, used or changed) at each moment and by whom, possibly including models, documents and other inputs and outputs. In turn, specifying the models that must be dealt with implies defining the basic building blocks that should be used to construct. |  [wikipedia](https://en.wikipedia.org/wiki/Software_development_process) |
| sprint | A sprint (or iteration) is the basic unit of development in Scrum. The Sprint is a timeboxed effort; that is, it is restricted to a specific duration. The duration is fixed in advance for each Sprint and is normally between one week and one month, with two weeks being the most common. | [wikipedia](https://en.wikipedia.org/wiki/Scrum_&#40;software_development&#41;#Workflow) |
| sprint backlog | The sprint backlog is a list of tasks to be completed during the sprint. | [mountaingoatsoftware](https://www.mountaingoatsoftware.com/agile/scrum/sprint-backlog) |
| software build | Process of automating the creation of a software build and the associated processes including: compiling computer source code into binary code, packaging binary code, and running automated tests. | [wikipedia](https://en.wikipedia.org/wiki/Build_automation) |
