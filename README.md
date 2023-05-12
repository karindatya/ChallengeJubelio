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

![1](https://user-images.githubusercontent.com/131270958/236683287-4d8d6fe2-6df7-49c8-9b30-896fc62777a5.png)

2. Create New Project :

![2](https://user-images.githubusercontent.com/131270958/236683400-4576b15d-6e5e-4134-8155-5ca98d6495ea.png)


3. Connect local project with existing GitHub repository

4. Select Java language :

![4](https://user-images.githubusercontent.com/131270958/236683440-796ab042-e468-4773-8918-f9bd6eb57c0d.png)

5. Fill mvn repositories dependencies for selenium, junit jupiter, cucumber and cucumber reporting in pom.xml :

![5](https://user-images.githubusercontent.com/131270958/236683515-f26fd2e5-8478-47ff-a231-e762e054e6ac.png)

6. Download chromedriver based on OS and Chrome version

7. Copy chromedriver to resources : 

![7](https://user-images.githubusercontent.com/131270958/236683546-58337922-7a49-4acb-b547-9e1028ef3b53.png)

8. Create new 'config' package :

![8](https://user-images.githubusercontent.com/131270958/236683592-51691aa0-9778-4c77-b5ca-861dc2ea8a8b.png)

9. Create new `env_target` java class :

![9](https://user-images.githubusercontent.com/131270958/236683636-28bf2148-9ffb-468b-83b2-b45df544b021.png)

10. Fill env_target.java :

![10](https://user-images.githubusercontent.com/131270958/236683655-ee581864-f5af-4652-9ddd-309ab9a26117.png)

11. Create Login/Persediaan as New Java Class :

![11](https://user-images.githubusercontent.com/131270958/236683707-bbead079-e32a-49e6-bf04-dc032af138a9.png)

12. Fill test code in java class (example : xpath element, etc ) :

![12](https://user-images.githubusercontent.com/131270958/236683744-c26b2397-6ea7-4a13-9b98-69d3dbd19fe6.png)

13. Create 'resources' as New Directory :

![13](https://user-images.githubusercontent.com/131270958/236683778-08c57bb9-8c7f-444d-bcdb-db763d906a62.png)

14. Create 'features' as New Directory :

![14](https://user-images.githubusercontent.com/131270958/236683801-108c670b-f16f-49dc-95ac-99b185bcdbdc.png)

15. Create Login.feature (example) as New File :

![15](https://user-images.githubusercontent.com/131270958/236683829-c2a1d2a9-7bea-4ec0-9ed2-884f0da4dd41.png)

16. Write scenario in Login.feature :

![16](https://user-images.githubusercontent.com/131270958/236683881-b5d26dc5-bd1a-4744-8ee4-3fb4cdd98b16.png)

17. Create all step definitions in login.feature 

18. Create New Step Definition File, write 'LoginBdd' as FileName, select Java as FileType

19. Create 'stepDef' as New Package :

![19](https://user-images.githubusercontent.com/131270958/236683903-6b12ae70-02ad-40bf-a4b7-f2c83d721c93.png)

20. Copy element in Login.java to LoginBdd.java :

![20](https://user-images.githubusercontent.com/131270958/236683921-58d4d2f9-8bba-427b-a251-8b4ae331b01f.png)

21. Create 'runner' as New Package :

![21](https://user-images.githubusercontent.com/131270958/236683938-a52fa482-9e35-4be8-82c8-a28abe273560.png)

22. Create 'RunTest' as New Java Class :

![22](https://user-images.githubusercontent.com/131270958/236683981-17f8b076-223b-456f-a496-e67be79a17fd.png)

23. Create code in RunTest.Java :

![23](https://user-images.githubusercontent.com/131270958/236684027-2c285e6f-472f-46a1-ab44-16cb4b589eda.png)

24. Edit configuration and add Runner in JUnit :

![24](https://user-images.githubusercontent.com/131270958/236684057-d60d5199-e86b-44c0-8492-4cb5927e3493.png)

25. Run the Runner configuration :

![25](https://user-images.githubusercontent.com/131270958/236684104-071993a7-535a-4071-87ca-52a9a67c8350.png)

26. Commit all code

27. Push to origin




Evidence of Run Web Automation :

1. Screen recording :

https://youtu.be/qw0z94BHKck

2. Run results ( jumlah scenario & jumlah step) :
   
https://drive.google.com/file/d/1P60Kqch6FbX9lUDQVR6FPovo3BYJ5Lgq/view?usp=sharing

3. HTML Cucumber Report :

https://drive.google.com/file/d/1YUMFMve_UpDKU5IMftnDXxYmrr2i-n2W/view?usp=sharing



