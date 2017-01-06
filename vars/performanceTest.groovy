def call(){
	echo "Testing ${config.endpoint}"
   for (i = 0; i < 5; i++) { 
        println "Requests: " +  i**(i) 
        sleep i
    }

    echo "** Pass"
}