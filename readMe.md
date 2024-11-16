
	STEP 1   --  nov 11 2024
 
 included the below dependencies
 
 1. servlet Api
 2. spring web mvc
 3. mysql connector
 4. spring jdbc
 
 -----------------------------------------------------------------------------
 
 	 STEP 2
 	 
1. configuring Dispatcher Servlet
2. configuration file creating
3. create a controller (returns views)
4. creating view (studentList.jsp)

 -----------------------------------------------------------------------------

 
 		Step 3  -- creating DAO layer
 		
 1. Getting data from database
 
 -- creating POJO student class.
 -- creating studentDAO interface
 
 loadStudents() -- will loads all students from DB.
 
 DAO -- design pattern is using.
 
  -----------------------------------------------------------------------------
  		STEP 4 
  		
  Creating Dynamic HTML table
  
  -----------------------------------------------------------------------------
  
  		STEP 5
  		
  	-- Adding the 'ADD' buttion-functionality to add the new students
  	
  	step1 : create a method for a FORM-APPLICATION in a controller layer
  	step2 : create a form (add-student.jsp)
  	step3 : created a studentDTO object (Data Transfer Object)
  	step4 : captured and saved the submitted student info from front-end
  	step5 : Saved that particular record into the Database successfully.
  	Note  : we may see the project is still erroring out, but just go ahead and run the application.
  	
 -----------------------------------------------------------------------------
 
 
 			POST - REDIRECT -GET PATTERN
 			
 -> if the user tried to do refresh the addPage, it will continuously getting executed
 As a result, there would be multiple/duplicate records inserted into DB.
 
 -- To resolve this issue, we should have to implement Post Redirect Get Pattern(PRG pattern).
 
  -----------------------------------------------------------------------------
 
 		UPDATING THE STUDENT RECORD.
 		
 		->modify the student-page and provide update link for each student row on page.
  1. create a update handler method in controller class. ("/updateStudent")
  2. Redirect to add-student.jsp page with already retrieved data.
  3. we have collected the Id from already retrieved data.
  4. We have updated the record by adding one method where if (studentDTO.getId()!=0) in controller layer.
  5. We have done some modifications like not used the studentDTO object. But we used the Student entity 
  as the modelAttribute in the jsp pages directly.
  
  ---------------------------------------------------------------------------------------------------------
  
   			Deleting the student record
   			
   1. created a delete link in student-list.jsp page
   2. developed a /deleteStudent url mapping in controller
   3. implemented logic to delete a student in the DAO layer
   4. Building logic to pop up a dialog box while deleting on front-end in student-list.jsp page.
   
     ---------------------------------------------------------------------------------------------------------
   1. Building/Applying CSS and BootStrap to improve the aesthetics of our application.
   2. created a separate folder to handle all the css,images and js things globally instead of 
   implementing in each and every file.
   3. Using css functionalities wherever we needed them.
   
     ---------------------------------------------------------------------------------------------------------
  		MAKING USE OF ALREADY DESIGNED CSS CLASSES USING BOOTSTRAP 
  
  1. visit this url:  https://getbootstrap.com/docs/5.3/content/tables/#accented-tables
  and search for whatever the items we needed such as tables, buttons etc.
  
       ---------------------------------------------------------------------------------------------------------
  
  
  	
  
 		
