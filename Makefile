build: MainClass.java
	javac MainClass.java

run: build
	@echo
	@echo Running the main class 
	@echo ======================
	@echo
	java MainClass