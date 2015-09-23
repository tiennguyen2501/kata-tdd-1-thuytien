module.exports=function(grunt){
	//configure main project settings
	 grunt.initConfig({
		 
		 //basic settings
		 pkg: grunt.file.readJSON('package.json'),
		 
		 //
		 cssmin: {
			 combine:{
				 files:{
					 'WebContent/css/main.css':['WebContent/css/content.css','WebContent/css/sidebar.css']
				 }
			 }
		 }
	 });
	 
	 //load the plugin
	 grunt.loadNpmTasks('grunt-contrib-cssmin');
	 
	 //Do the task
	 grunt.registerTask('default',['cssmin']);
	
};
