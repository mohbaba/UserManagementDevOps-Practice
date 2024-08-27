#!/bin/bash

echo "Hello lets begin creating project! "
read -p "Enter the name of the repository: " repository

mkdir $repository
cd $repository
mkdir .github
cd .github
mkdir workflows
cd workflows
touch workflows.yaml
cd .. 
cd ..
cd ..
gh repo create $repository --public
echo $repository >> README.md
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mohbaba/$repository.git
git push -u origin main
git branch in-dev
git push origin in-dev