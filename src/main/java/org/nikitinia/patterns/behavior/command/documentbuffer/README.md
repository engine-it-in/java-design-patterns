# Формулировка задачи
* В данной задаче мы работаем с документом. 
Вернее с его гипотетическом буфером. 
Буфер документа должен являться частью самого документа. 
Буфер должен заполняться в результате выполнения команд 
копирования и вставки. При этом у нас должна быть возможность
отменить команды вставки и копирования.
* Буфер - пространство для хранения промежуточных данных. 
Это своего рода резерв/хранилище, которое может быть 
использовано для работы с промежуточными данными, но
при этом сам буфер предполагает, что мы работаем с ним, как
с системным объектом.
* Ныряем и разбираемся.