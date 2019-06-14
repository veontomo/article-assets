for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar boolean >> boolean.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar long >> long.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar int >> int.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar char >> char.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar short >> short.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar byte >> byte.txt
)

for /l %%x in (1, 1, 100) do (
   java -jar primitive.jar double >> double.txt
)