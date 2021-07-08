# Introduction

This program displays quotes from the database. It featches 
quotes from databse of quotes as the user clicks next and store 
those as cache. So, it can be displayed again when the user 
click prev and wants to view the previous quotes.

# Design patterns

## Singleton 

We have used this pattern to retrieve data from the database, 
a file in this case.

## Proxy

We have used this pattern to retrieve the data only once and 
store it in memory.

## Iterator

This pattern is used for viewing the next or previous quote 
in the list of quotes.

# Running

First make sure you have `make` installed and `java-15`

To build, and run, the following command will suffice.

```
make run
```

To clean all the `.class` files

```
make clean
```

To only build.

```
make build
```

# Group members

| Name               | ID         |
|--------------------|------------|
| Nebil Mohammed     | ETS0958/10 |
| Omer Abdulaziz     | ETS0988/10 |
