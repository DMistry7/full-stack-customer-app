**DataBase**

Ensure Docker app is running and the container is activated  
Can check by running docker ps in the start of the repo  
(For first time will need: docker compose up -d db  
then add customer to database)


**IJ (Backend)**

Run main  
(Java 17)

**React (Frontend)**

cd frontend\react  
npm run dev  
above two commands gets the front end started, take the local host produced and put in browser

**Switch to Public Browser**

Firstly, in the frontend\react\.env file, change the VITE from VITE_API_BASE_URL=http://localhost:8080 to VITE_API_BASE_URL=http://<beanstalk-env>.eu-west-1.elasticbeanstalk.com
(Would also need to restart vite)

(Done : set docker.username and docker.image.tag then run jib:build)  
(Done : dockerrun.aws.json must use version 1)

Create RDS PostgreSQL instance  
Create the Beanstalk environment  
Set the environment properties  
Open EC2, add inbound rule for the RDS  
Use amplify and connect the git hub (tick monorepo and set root to frontend/react)

(Need to change chrome site settings to allow insecure content to use features)

Ensure you tear down everything after as you need to pay for AWS.
Delete Amplify app  
Delete Inbound rule  
Terminate Environment for Beanstalk  
RDS delete  
EC2 release any Elastics Ips

