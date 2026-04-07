@echo off
rem Set the path to the JDK bin directory if not already in PATH
set JDK_PATH="C:\Program Files\Java\jdk1.8.0_202\bin"

rem Specify the path to the WSDL file
set WSDL_PATH="C:\Users\ADMIN\Downloads\mnpservice.wsdl"

rem Specify the output directory for generated source files
set SOURCE_OUTPUT="D:\soap\generated-src"

rem Specify the output directory for compiled class files
set CLASS_OUTPUT="D:\soap\generated-bin"

rem Run the wsimport command to generate the stubs
%JDK_PATH%\wsimport -keep -s %SOURCE_OUTPUT% -d %CLASS_OUTPUT% %WSDL_PATH%

echo Stub generation completed.
pause
