# vi e.sh
#!/bin/bash
select n in "di bien" "an uong" "di nui" "xem phim" "the thao"
do 
	if [ "$n" == "" ]; then
		echo "Ban hay chon mot";
	else
		break
	fi
done
echo "So thich cua ban $n"
