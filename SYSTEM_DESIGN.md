# 🛠 SYSTEM DESIGN

## 🧩 Overview

This microservice is a self-contained **Spring Boot application** for managing products using basic CRUD operations and extended search capabilities. It supports modern DevOps practices using **Docker**, **Kubernetes**, and **GitHub Actions**.

---

## 📊 Architecture

```plaintext
User
  |
  | HTTP REST API
  v
Spring Boot Microservice (Product CRUD)
  |
  | Repository Layer
  v
MySQL Database
