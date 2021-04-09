@Echo off
SET LOGFILE=C:\Selenium\Batchfile_log.log
call :Logit >> %LOGFILE%
exit /b 0
:Logit
set projectpath=C:\Selenium\Selenium2\sampleTest
cd %projectpath%
set classpath=%projectpath%\target\test-classes;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\printreport.xml
@ECHO OFF
TITLE Date-and-Time
COLOR 0A

:START
CLS
	
TIME /T
DATE /T
