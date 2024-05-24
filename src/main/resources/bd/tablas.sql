
if not exists (select * from sysobjects where name='usuario' and xtype='U')
    create table usuario (id int primary key, password varchar(255) default null, username varchar(255) default null);
if not exists (select * from sysobjects where name='authority' and xtype='U')
    create table authority (id int primary key, authority varchar(255) default null);
if not exists (select * from sysobjects where name='authorities_users' and xtype='U')
    create table authorities_users (usuario_id int not null, authority_id int not null, primary key (usuario_id, authority_id), foreign key (authority_id) references authority (id), foreign key (usuario_id) references usuario (id));













---tabla usuario--
--if not exists (select * from sysobjects where name='usuario' and xtype='U')

  --create table usuario (usuario_id int primary key, usuario_nombre varchar(255),usuario_password varchar(255));


--tabla rolempleado--

    if not exists (select * from sysobjects where name='rolEmpleado' and xtype='U')
        create table rolEmpleado (rolEmpleado_id int primary key, rolEmpleado_nombre varchar(255));
---tabla turnoempleado---
        if not exists (select * from sysobjects where name='turnoEmpleado' and xtype='U')
            create table turnoEmpleado (turnoEmpleado_id int primary key, turnoEmpleado_nombre varchar(255));

--tabla aportesempleado---
            if not exists (select * from sysobjects where name='aportesEmpleado' and xtype='U')
                create table aportesEmpleado (aportesEmpleado_id int primary key, aportesEmpleado_nombre varchar(255));

---tabla sexo--
                if not exists (select * from sysobjects where name='sexo' and xtype='U')
                    create table sexo (sexo_id int primary key, sexo_nombre varchar(255));



---tabla motos--

if not exists (select * from sysobjects where name='marcamoto' and xtype='U')
    create table marcamoto (marcamoto_id int primary key, marca_nombre varchar(255));
if not exists (select * from sysobjects where name='tipomoto' and xtype='U')
    create table tipomoto (tipomoto_id int primary key, tipomoto_nombre varchar(255));

    --tabla de carros--
    if not exists (select * from sysobjects where name='marca' and xtype='U')
        create table marca (marca_id int primary key, marca_nombre varchar(255));
    if not exists (select * from sysobjects where name='combustible' and xtype='U')
        create table combustible (combustible_id int primary key, combustible_nombre varchar(255));
    if not exists (select * from sysobjects where name='estado' and xtype='U')
        create table estado (estado_id int primary key, estado_nombre varchar(255));




        --tablas carros--

        if not exists (select * from sysobjects where name='marcaca' and xtype='U')
            create table marcaca (marcaca_id int primary key, marcaca_nombre varchar(255));
        if not exists (select * from sysobjects where name='estadoca' and xtype='U')
            create table estadoca (estadoca_id int primary key, estadoca_nombre varchar(255));








