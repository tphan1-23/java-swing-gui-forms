@echo off

set /p jar_file=Enter name of your jar file:

jar -tvf %jar_file%

echo Make sure you see .java files listed above for package program4 before continuing

pause

jar -xvf %jar_file%

pause

copy *.class program4\*.*

pause


echo Verify program runs correctly for EmployeeForm class

java -cp . program4.EmployeeFormTester
pause                                                                                                                                                                                                                      
	                                                                                                                                                                                                                       
echo Verify program runs correctly for RadioButtonTester class

java -cp . program4.RadioButtonTester

echo Verify program runs correctly

pause




