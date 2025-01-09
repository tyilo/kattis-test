# Submit to https://open.kattis.com/problems/hello
import re
import sys

m = re.search(r"PyPy (\S+)", sys.version)
if not m:
    exit(1)

version = m.group(1)
if version == "7.3.16":
    print("Hello World!")
else:
    print(":(")
