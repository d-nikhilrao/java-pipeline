pipeline
{
agent
{
label 'master'
}
stages
{
stage ('Build')
{
steps
{
echo 'Building is in Progress'
sh 'ant -f build.xml -v'
echo 'Build Completed Successfully'  
}
}
}
}
