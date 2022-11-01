#for($i=65;$i -lt 123;$i++){$alphabet.add([char]$i,0)}

$alphabet=[ordered]@{}
foreach($l in get-content C:\users\t0879757_s\Downloads\wordlist.txt){foreach($c in [char[]]$l){if ($alphabet.contains($c)){$alphabet[$c]+=1}else{$alphabet.add($c,$alphabet[$c]+1)}}}
$alphabet=($alphabet.GetEnumerator()|sort-object -Property value -Descending)
$alphabet