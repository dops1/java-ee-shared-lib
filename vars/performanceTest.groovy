def call(Map config){

   if(config.endpoint == null){
	 error "endpoint: <URL> is required!"
   }

   echo "Testing ${config.endpoint}"
   
   for (i = 0; i < 5; i++) { 
        println "Requests: " +  i**(i) 
        sleep i
    }

    echo "** Pass"
}