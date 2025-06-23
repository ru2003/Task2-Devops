# 🧩 Spring Boot CRUD Microservice with Docker, Kubernetes & CI/CD

## 📌 Overview

This project is a simple **Product Management Microservice** built with **Spring Boot**, featuring:

- Full CRUD operations
- API versioning (v1.0, v1.1, v2.0)
- Keyword & category-based search (v2.0)
- Health-check endpoint
- Docker containerization
- Deployment to Kubernetes
- CI/CD pipeline with GitHub Actions

---

## 🚀 Features

version   |    features

| v1.0    | Basic CRUD, Health Check     Endpoint                                        |
| v1.1    | Added search functionality with keyword filtering                        |
| v2.0    | Enhanced search with keyword + category, exception handling              |

---
# 🧰 Spring Boot CRUD Example

A simple CRUD microservice using **Spring Boot**, **Docker**, **Kubernetes**, and **CI/CD with GitHub Actions**.

---

## 📁 Folder Structure

spring-boot-crud-example-master/
│
├── .github/
│ └── workflows/
│ └── deploy.yml # GitHub Actions CI/CD Pipeline
│
├── src/
│ └── main/
│ ├── java/
│ │ └── com/javatechie/crud/example/
│ │ ├── controller/
│ │ │ └── ProductController.java
│ │ ├── entity/
│ │ │ └── Product.java
│ │ ├── repository/
│ │ │ └── ProductRepository.java
│ │ ├── service/
│ │ │ ├── ProductService.java
│ │ │ └── ProductServiceImpl.java
│ │ └── SpringBootCrudExampleApplication.java
│ │
│ └── resources/
│ └── application.properties
│
├── Dockerfile # Docker configuration
├── deployment.yaml # Kubernetes Deployment
├── service.yaml # Kubernetes Service
├── k8s-config.yaml # (Optional) Combined K8s manifest
├── pom.xml # Maven build file
│
├── README.md # Project Overview
├── CHANGELOG.md # Version History
├── SYSTEM_DESIGN.md # High-level Design

yaml
Copy code

---

## 🚀 Running the Project

### 🐳 **Run with Docker**
```bash
docker build -t product-app .
docker run -p 8080:8080 product-app
☸️ Deploy on Kubernetes
bash
Copy code
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl get pods
kubectl port-forward service/product-service 8080:8080
Once deployed, access the API at:
🔗 http://localhost:8080

🔁 CI/CD Pipeline
A GitHub Actions workflow is configured at:
.github/workflows/deploy.yml

It performs the following:

✅ Builds Docker image

✅ Pushes it to DockerHub

✅ Deploys to Kubernetes cluster

🔐 Secrets Used:
Secret Name	Description
DOCKER_USERNAME	Your Docker Hub username
DOCKER_PASSWORD	Your Docker Hub token/password
KUBECONFIG	Base64 encoded kubeconfig file

📦 Submission Checklist
✅ Microservice source code

✅ Dockerfile

✅ Kubernetes manifests (deployment.yaml, service.yaml)

✅ GitHub Actions workflow

✅ README.md

✅ CHANGELOG.md

✅ SYSTEM_DESIGN.md

✅ Screenshots/video added

👩‍💻 Author
Ruchita Nandakishor Chaudhari
Spring Boot | DevOps | CI/CD | Java Developer 