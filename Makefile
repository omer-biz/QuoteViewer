build: MainClass.java \
        Container.java \
        QuoteRepository.java \
        QuoteList.java \
        Iterator.java \
	javac MainClass.java

run: build
	@echo
	@echo Running the main class 
	@echo ======================
	@echo
	java MainClass
