Web Automation Steps

Project title         : ChallengeJubelio

Tools/framework       : Selenium (Java) & Cucumber

Runner                : JUnit

Website               : https://app.jubelio.com/login
                        https://app.jubelio.com/home/inventory

Project Management    : Maven (CI/CD, depedencies)

Report                : RegressionReport.html


Steps:
1. Create repository in GitHub :

![Screenshot 2023-05-07 at 19.05.43.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_crqrNj%2FScreenshot%202023-05-07%20at%2019.05.43.png)

2. Create New Project :

![Screenshot 2023-05-07 at 19.16.24.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_jGqagK%2FScreenshot%202023-05-07%20at%2019.16.24.png)

3. Connect local project with existing GitHub repository

4. Select Java language :

![Screenshot 2023-05-07 at 19.23.25.png](..%2F..%2FDesktop%2FScreenshot%202023-05-07%20at%2019.23.25.png)

5. Fill mvn repositories dependencies for selenium, junit jupiter, cucumber and cucumber reporting in pom.xml :

![Screenshot 2023-05-07 at 19.56.21.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_mIUhub%2FScreenshot%202023-05-07%20at%2019.56.21.png)

![Screenshot 2023-05-07 at 19.57.13.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_JDYC8Q%2FScreenshot%202023-05-07%20at%2019.57.13.png)

6. Download chromedriver based on OS and Chrome version

7. Copy chromedriver to resources : 

![Screenshot 2023-05-07 at 19.31.10.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Cz5xfc%2FScreenshot%202023-05-07%20at%2019.31.10.png)

8. Create new 'config' package :

![Screenshot 2023-05-07 at 19.35.53.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Lo9UCO%2FScreenshot%202023-05-07%20at%2019.35.53.png)

9. Create new `env_target` java class :

![Screenshot 2023-05-07 at 19.38.03.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_clb3hX%2FScreenshot%202023-05-07%20at%2019.38.03.png)

10. Fill env_target.java :

![Screenshot 2023-05-07 at 19.40.42.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_L5niMz%2FScreenshot%202023-05-07%20at%2019.40.42.png)

11. Create Login/Persediaan as New Java Class :

![Screenshot 2023-05-07 at 19.43.15.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_C98ZdV%2FScreenshot%202023-05-07%20at%2019.43.15.png)

12. Fill test code in java class (example : xpath element, etc ) :

![Screenshot 2023-05-07 at 19.48.49.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_XdsmB4%2FScreenshot%202023-05-07%20at%2019.48.49.png)

13. Create 'resources' as New Directory :

![Screenshot 2023-05-07 at 20.00.01.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_oXAxm4%2FScreenshot%202023-05-07%20at%2020.00.01.png)

14. Create 'features' as New Directory :

![Screenshot 2023-05-07 at 20.03.51.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_kq5cOJ%2FScreenshot%202023-05-07%20at%2020.03.51.png)

15. Create Login.feature (example) as New File :

![Screenshot 2023-05-07 at 20.06.35.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_PApopC%2FScreenshot%202023-05-07%20at%2020.06.35.png)

16. Write scenario in Login.feature :

![Screenshot 2023-05-07 at 20.07.53.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_H9vcBi%2FScreenshot%202023-05-07%20at%2020.07.53.png)

17. Create all step definitions in login.feature 

18. Create New Step Definition File, write 'LoginBdd' as FileName, select Java as FileType

19. Create 'stepDef' as New Package :

![Screenshot 2023-05-07 at 20.14.21.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_xCuOb6%2FScreenshot%202023-05-07%20at%2020.14.21.png)

20. Copy element in Login.java to LoginBdd.java :

![Screenshot 2023-05-07 at 20.17.08.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_l6KbhB%2FScreenshot%202023-05-07%20at%2020.17.08.png)

21. Create 'runner' as New Package :

![Screenshot 2023-05-07 at 20.24.36.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_syFTuU%2FScreenshot%202023-05-07%20at%2020.24.36.png)

22. Create 'RunTest' as New Java Class :

![Screenshot 2023-05-07 at 20.26.06.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_DTVHea%2FScreenshot%202023-05-07%20at%2020.26.06.png)

23. Create code in RunTest.Java :

![Screenshot 2023-05-07 at 20.23.11.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_DBVqg4%2FScreenshot%202023-05-07%20at%2020.23.11.png)

24. Edit configuration and add Runner in JUnit :

![Screenshot 2023-05-07 at 20.28.19.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_PjlHxX%2FScreenshot%202023-05-07%20at%2020.28.19.png)

25. Run the Runner configuration :

![Screenshot 2023-05-07 at 20.29.37.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fkv%2F2qr2f8_52zlb2tgb7j02s9mw0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_HURQVH%2FScreenshot%202023-05-07%20at%2020.29.37.png)

26. Commit all code

27. Push to origin