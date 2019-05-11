### Demo Project

## Kubectl commands

Deploy
- kubectl run demo-deployment --image=demo:0.1.0-SNAPSHOT --port=8080 --port=8081

Debug
- kubectl get pods
- kubectl logs demo-deployment-5c8845bbbb-nlzcn -c demo-deployment

Stop
-  kubectl delete deployment demo-deployment