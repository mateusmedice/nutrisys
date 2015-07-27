echo off

cd $CATALINA_HOME/bin

export JPDA_ADDRESS=8000
export JPDA_TRANSPORT=dt_socket

./catalina.sh jpda start

cd ../logs/

tail -f catalina.out
