cd /home/genius/test/meta-mainline
git co master

FOLDERS_TO_PROCESS="beagle-bone-black-ml/ beagle-bone-white-ml/ beagle-xm-ml/ igepv2-ml/ m28evk-ml/ panda-ml/ socrates-ml/ vexpressa9/ wandboard-dl-ml/ wandboard-q-ml/"

for FOLDER in ${FOLDERS_TO_PROCESS}
echo  "git clean -f -d ${FOLDER}"
fi

git st
git clean -f -d <all folders which show up before>
git co master
git pull

#git fetch --all
#git pull
#git reset --hard origin/master
#git clean -f -d

---> fix master

cd ~/test
wget https://raw.githubusercontent.com/RobertBerger/meta-mainline/master/scripts/doc-docker-container/fix-master-branch.sh
chmod +x fix-master-branch.sh
./fix-master-branch.sh 

<--- fix master

---> latest stuff

cd /home/genius/test/meta-mainline

git st 

git co master
git pull

git st
git branch -a
git co origin/dizzy-training-v3.14.x
git checkout -b dizzy-training-v3.14.x_LOCAL 
git branch --set-upstream-to=origin/dizzy-training-v3.14.x dizzy-training-v3.14.x_LOCAL
git pull

<--- latest stuff
