#!/bin/bash
for i in {60..100}
do
   git checkout master
   git checkout -b "branch$i"
   touch "$i"
   git add .
   git commit -am "Message$i"
   git push origin "branch$i"
  gh pr create --title "The bug is fixed $i"  --body "Everything works fine$i"
done